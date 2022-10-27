organization := "org.scalablytyped"
name := "azure-arm-resource"
version := "7.4.0-9b26e5"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "adal-node" % "0.2.3-9ab63d",
  "org.scalablytyped" %%% "ms-rest" % "2.5.6-35f368",
  "org.scalablytyped" %%% "ms-rest-azure" % "3.0.2-e40292",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
