organization := "org.scalablytyped"
name := "azure-arm-resource"
version := "7.4.0-668fd8"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "adal-node" % "0.2.1-ff9860",
  "org.scalablytyped" %%% "ms-rest" % "2.5.4-046cb3",
  "org.scalablytyped" %%% "ms-rest-azure" % "2.6.0-6d6081",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
