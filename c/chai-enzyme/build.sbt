organization := "org.scalablytyped"
name := "chai-enzyme"
version := "0.6.1-dt-20190808Z-c4837b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chai" % "4.2-dt-20191022Z-a94ee8",
  "org.scalablytyped" %%% "cheerio" % "v0.22.0-dt-20190809Z-70ae3d",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20190715Z-562938",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191024Z-c10572",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191025Z-9e835e",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        