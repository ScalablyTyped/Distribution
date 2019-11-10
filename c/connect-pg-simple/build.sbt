organization := "org.scalablytyped"
name := "connect-pg-simple"
version := "4.2-dt-20180214Z-0637ab"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-675d96",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-1971cc",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-df008a",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20191101Z-cdc4d1",
  "org.scalablytyped" %%% "express-session" % "1.15-dt-20191017Z-aa270a",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-301fe0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191108Z-6cbaae",
  "org.scalablytyped" %%% "pg" % "7.11-dt-20190926Z-81623a",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20191101Z-8564ea",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ebcbf",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-1c7f66",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        