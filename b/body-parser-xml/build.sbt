organization := "org.scalablytyped"
name := "body-parser-xml"
version := "2.0-dt-20211202Z-a0ab38"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20211202Z-b83ae9",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-877ec7",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-a3e709",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20220416Z-d6ccff")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
