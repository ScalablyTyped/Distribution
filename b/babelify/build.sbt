organization := "org.scalablytyped"
name := "babelify"
version := "v7.3.0-dt-20190322Z-7d5315"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-d8ab4b",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-02a822",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-24b74d",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-f33bb5",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-5e9729",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-13ceda",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191023Z-ebe9d8",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        