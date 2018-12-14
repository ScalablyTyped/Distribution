organization := "org.scalablytyped"
name := "connect-pg-simple"
version := "4.2-dt-20180910Z-3c7388"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-addcd5",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-564d85",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180910Z-50ee2c",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-a97c36",
  "org.scalablytyped" %%% "express-session" % "1.15-dt-20180910Z-b1880d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-1d49f8",
  "org.scalablytyped" %%% "moment" % "2.23.0-39ab00",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "pg" % "7.4-dt-20181009Z-c34a6f",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180910Z-04565c",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181208Z-481dd9",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-eb00ce",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        