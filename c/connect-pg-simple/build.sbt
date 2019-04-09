organization := "org.scalablytyped"
name := "connect-pg-simple"
version := "4.2-dt-20180214Z-1ee1c6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-a8ed72",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-6a8dc8",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-14c66e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-d8c77b",
  "org.scalablytyped" %%% "express-session" % "1.15-dt-20190212Z-22accf",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-2631f3",
  "org.scalablytyped" %%% "moment" % "2.24.0-da0e25",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190408Z-6fa8bf",
  "org.scalablytyped" %%% "pg" % "7.4-dt-20190319Z-1d3785",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180214Z-f60afc",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-623d43",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-4ceb07",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        