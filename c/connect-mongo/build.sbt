organization := "org.scalablytyped"
name := "connect-mongo"
version := "0.0-unknown-dt-20190322Z-feaa27"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-d1ac4d",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-1c8b03",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-751003",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-6ba758",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-92341b",
  "org.scalablytyped" %%% "express-session" % "1.15-dt-20190212Z-a2ddd8",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-2631f3",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190411Z-0c73cc",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190408Z-00349e",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-623d43",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-84d26d",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        