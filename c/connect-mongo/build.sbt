organization := "org.scalablytyped"
name := "connect-mongo"
version := "3.0-dt-20191028Z-17d3a8"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-912347",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-a22cb2",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-183255",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-900bce",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20191015Z-04f31e",
  "org.scalablytyped" %%% "express-session" % "1.15-dt-20191017Z-d3f116",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-8e1e66",
  "org.scalablytyped" %%% "mongodb" % "3.3-dt-20191029Z-42ff67",
  "org.scalablytyped" %%% "mongoose" % "5.5.1-dt-20191030Z-18ef56",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191030Z-4bf573",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c44ea2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-6a27ff",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        