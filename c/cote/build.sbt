organization := "org.scalablytyped"
name := "cote"
version := "0.19-dt-20211202Z-4e207a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20211202Z-3b2b8e",
  "org.scalablytyped" %%% "engine_dot_io" % "6.2.0-af81e9",
  "org.scalablytyped" %%% "engine_dot_io-parser" % "5.0.4-78b511",
  "org.scalablytyped" %%% "eventemitter2" % "6.4.9-ce72d4",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "socket_dot_io" % "4.5.2-16cd71",
  "org.scalablytyped" %%% "socket_dot_io-adapter" % "2.4.0-6db76f",
  "org.scalablytyped" %%% "socket_dot_io-parser" % "4.2.1-806962",
  "org.scalablytyped" %%% "socket_dot_io__component-emitter" % "3.1.0-2698ce",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
