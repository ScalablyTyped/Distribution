organization := "org.scalablytyped"
name := "connect-redis"
version := "0.0-unknown-dt-20181128Z-f8fda2"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-d7d4ef",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-448588",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180910Z-6e8abe",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-dfbf83",
  "org.scalablytyped" %%% "express-session" % "1.15-dt-20180910Z-ab6f82",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-399889",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20180910Z-db862f",
  "org.scalablytyped" %%% "redis" % "2.8-dt-20181120Z-62e3cb",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-c19301",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        