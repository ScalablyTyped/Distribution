organization := "org.scalablytyped"
name := "connect-mongo"
version := "0.0-unknown-dt-20190322Z-c8a52a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-babc1e",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-5ffbea",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-db9829",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-4760bf",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190429Z-5e3ea9",
  "org.scalablytyped" %%% "express-session" % "1.15-dt-20190212Z-2be256",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-169399",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190501Z-9d1619",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190426Z-53e5b6",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190502Z-84ec9f",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-acf35f",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-a9f802",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        