organization := "org.scalablytyped"
name := "babelify"
version := "v7.3.0-dt-20190322Z-2ec374"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20190212Z-de01b5",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-ee164f",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-55be8b",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-d76ae8",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190218Z-65f6d4",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-2e02b0",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190419Z-3f0246",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        