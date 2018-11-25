organization := "com.scalablytyped"
name := "connect-pg-simple"
version := "4.2-dt-20180910Z-27d6bb"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-83ee83",
  "com.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-6d6e76",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-abe6d1",
  "com.scalablytyped" %%% "express" % "4.16-dt-20180910Z-7cbe9d",
  "com.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-87f8bc",
  "com.scalablytyped" %%% "express-session" % "1.15-dt-20180910Z-66ce97",
  "com.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-f9ab87",
  "com.scalablytyped" %%% "moment" % "2.22.2-b3769a",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-913134",
  "com.scalablytyped" %%% "pg" % "7.4-dt-20181009Z-6a4b50",
  "com.scalablytyped" %%% "pg-types" % "1.11-dt-20180910Z-b375a5",
  "com.scalablytyped" %%% "range-parser" % "1.2-dt-20180910Z-dfa7aa",
  "com.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-7c0e63",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        