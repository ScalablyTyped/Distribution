organization := "org.scalablytyped"
name := "browser-sync"
version := "0.0-unknown-dt-20180927Z-a76a21"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180910Z-32ac72",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180910Z-34f74c",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-702174",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180910Z-eb92da",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-60e32c",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181208Z-7e710f",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-35654c",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        