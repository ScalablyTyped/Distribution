organization := "org.scalablytyped"
name := "body-parser-xml"
version := "2.0-dt-20211202Z-8d199d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20211202Z-d14bdd",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-02afba",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-8b48ae",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20220416Z-cc3b3c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
