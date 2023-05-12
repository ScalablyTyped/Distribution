organization := "org.scalablytyped"
name := "cote"
version := "0.19-dt-20221230Z-c311db"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20221205Z-9881d5",
  "org.scalablytyped" %%% "engine_dot_io" % "6.4.2-ae3ba8",
  "org.scalablytyped" %%% "engine_dot_io-parser" % "5.0.6-7db265",
  "org.scalablytyped" %%% "eventemitter2" % "6.4.9-a4982c",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "socket_dot_io" % "4.6.1-7535d7",
  "org.scalablytyped" %%% "socket_dot_io-adapter" % "2.5.2-3c3f47",
  "org.scalablytyped" %%% "socket_dot_io-parser" % "4.2.2-e1b854",
  "org.scalablytyped" %%% "socket_dot_io__component-emitter" % "4.0.0-7185bd",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
