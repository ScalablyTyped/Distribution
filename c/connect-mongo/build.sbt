organization := "org.scalablytyped"
name := "connect-mongo"
version := "0.0-unknown-dt-20181204Z-ff6dd7"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-e65c03",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180721Z-d496ac",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-38b4a6",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180603Z-05cc5e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180604Z-776b92",
  "org.scalablytyped" %%% "express-session" % "1.15-dt-20180901Z-4553cd",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-b650df",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20181223Z-7d3e22",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20181210Z-945f29",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-ef877c",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-f8f5d7",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        