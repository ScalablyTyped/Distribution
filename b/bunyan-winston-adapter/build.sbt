organization := "com.scalablytyped"
name := "bunyan-winston-adapter"
version := "0.2-dt-20181018Z-1ef4aa"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "async" % "2.0.1-dt-20181020Z-4e17a5",
  "com.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-e292a0",
  "com.scalablytyped" %%% "is-stream" % "1.1-dt-20180910Z-7e82fe",
  "com.scalablytyped" %%% "logform" % "1.2-dt-20180910Z-c65ab9",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180910Z-9bfd99",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "triple-beam" % "1.3-dt-20180910Z-3c3247",
  "com.scalablytyped" %%% "winston" % "3.1.0-daf2a0",
  "com.scalablytyped" %%% "winston-transport" % "4.2.0-2eefbf",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        