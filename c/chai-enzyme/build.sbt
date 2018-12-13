organization := "org.scalablytyped"
name := "chai-enzyme"
version := "0.6.1-dt-20180910Z-84a1e2"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181027Z-6866ba",
  "org.scalablytyped" %%% "cheerio" % "v0.22.0-dt-20181126Z-0d30f8",
  "org.scalablytyped" %%% "csstype" % "2.5.8-939493",
  "org.scalablytyped" %%% "enzyme" % "3.1-dt-20181109Z-15c8a0",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-7481e3",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181213Z-296d60",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        