organization := "org.scalablytyped"
name := "cote"
version := "0.19-dt-20211202Z-a953be"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20221103Z-6201fd",
  "org.scalablytyped" %%% "engine_dot_io" % "6.2.0-99cdba",
  "org.scalablytyped" %%% "engine_dot_io-parser" % "5.0.4-39f713",
  "org.scalablytyped" %%% "eventemitter2" % "6.4.9-1fd88a",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "socket_dot_io" % "4.5.3-5e6279",
  "org.scalablytyped" %%% "socket_dot_io-adapter" % "2.4.0-c67545",
  "org.scalablytyped" %%% "socket_dot_io-parser" % "4.2.1-2d4e1f",
  "org.scalablytyped" %%% "socket_dot_io__component-emitter" % "3.1.0-02cf62",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
