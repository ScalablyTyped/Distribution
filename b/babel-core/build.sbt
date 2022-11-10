organization := "org.scalablytyped"
name := "babel-core"
version := "6.25-dt-20211202Z-66c17b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20211223Z-42cd76",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20211202Z-6d3c23",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20211202Z-6d008e",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20211202Z-4facf2",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20211202Z-163f06",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
