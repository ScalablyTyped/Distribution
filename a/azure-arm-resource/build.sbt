organization := "org.scalablytyped"
name := "azure-arm-resource"
version := "7.4.0-d69c98"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "adal-node" % "0.2.3-c8ac23",
  "org.scalablytyped" %%% "ms-rest" % "2.5.6-678921",
  "org.scalablytyped" %%% "ms-rest-azure" % "3.0.2-44022e",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
