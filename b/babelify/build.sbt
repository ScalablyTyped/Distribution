organization := "org.scalablytyped"
name := "babelify"
version := "v7.3.0-dt-20190322Z-0341cd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-019623",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-6f9e55",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-86376c",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-88069f",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-98b295",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-ae970d",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190717Z-e46800",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        