organization := "org.scalablytyped"
name := "azure-arm-resource"
version := "7.4.0-fa72d6"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "adal-node" % "0.2.3-84b8c3",
  "org.scalablytyped" %%% "ms-rest" % "2.5.6-84f6a1",
  "org.scalablytyped" %%% "ms-rest-azure" % "3.0.2-fe4fba",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
