organization := "org.scalablytyped"
name := "connect-pg-simple"
version := "4.2-dt-20180214Z-7c193f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-041fae",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-0256e3",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-2f223f",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-5ccdcb",
  "org.scalablytyped" %%% "express-session" % "1.15-dt-20190619Z-b810c5",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-1c84be",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190708Z-e1e986",
  "org.scalablytyped" %%% "pg" % "7.4-dt-20190319Z-5bf0e2",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180214Z-249a99",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-f16918",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-496baf",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        