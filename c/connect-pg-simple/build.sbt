organization := "org.scalablytyped"
name := "connect-pg-simple"
version := "4.2-dt-20180214Z-9d4350"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-0f462b",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-8e708a",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190816Z-515e7b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190816Z-71409c",
  "org.scalablytyped" %%% "express-session" % "1.15-dt-20190619Z-015e4e",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-c877f7",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-2dc4df",
  "org.scalablytyped" %%% "pg" % "7.11-dt-20190816Z-e8d4aa",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180214Z-0c1ac5",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-b87c0a",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-55674a",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        