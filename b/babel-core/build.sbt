organization := "org.scalablytyped"
name := "babel-core"
version := "6.25-dt-20190212Z-de2436"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-44ca08",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-6fd3bd",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-dc579b",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-4da460",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-ab1717",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        