organization := "org.scalablytyped"
name := "azure-arm-resource"
version := "7.4.0-bde212"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "adal-node" % "0.2.4-577275",
  "org.scalablytyped" %%% "ms-rest" % "2.5.6-18ccd2",
  "org.scalablytyped" %%% "ms-rest-azure" % "3.0.2-a539de",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
