organization := "org.scalablytyped"
name := "cote"
version := "0.19-dt-20221230Z-fb2a5e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20221205Z-fde78e",
  "org.scalablytyped" %%% "engine_dot_io" % "6.4.2-e92acb",
  "org.scalablytyped" %%% "engine_dot_io-parser" % "5.0.6-7db265",
  "org.scalablytyped" %%% "eventemitter2" % "6.4.9-a4982c",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "socket_dot_io" % "4.6.1-38b813",
  "org.scalablytyped" %%% "socket_dot_io-adapter" % "2.5.2-64898a",
  "org.scalablytyped" %%% "socket_dot_io-parser" % "4.2.2-e1b854",
  "org.scalablytyped" %%% "socket_dot_io__component-emitter" % "4.0.0-7185bd",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
