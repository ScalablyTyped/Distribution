organization := "org.scalablytyped"
name := "connect-pg-simple"
version := "4.2-dt-20180214Z-866678"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-eda7b1",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-28d2d3",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-c7cba5",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-10584a",
  "org.scalablytyped" %%% "express-session" % "1.15-dt-20190212Z-ea3c02",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-b7b3da",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190417Z-002402",
  "org.scalablytyped" %%% "pg" % "7.4-dt-20190319Z-6af2d0",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180214Z-6da554",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c3b9c7",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-82bdb8",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        