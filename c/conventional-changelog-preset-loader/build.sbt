organization := "org.scalablytyped"
name := "conventional-changelog-preset-loader"
version := "2.3-dt-20220624Z-edd332"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "conventional-changelog-core" % "4.2-dt-20211216Z-1c9a8b",
  "org.scalablytyped" %%% "conventional-changelog-writer" % "4.0-dt-20220624Z-001b24",
  "org.scalablytyped" %%% "conventional-commits-parser" % "3.0-dt-20211202Z-4b2340",
  "org.scalablytyped" %%% "conventional-recommended-bump" % "6.1-dt-20220624Z-8290f6",
  "org.scalablytyped" %%% "git-raw-commits" % "2.0-dt-20220624Z-9ffbd6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20211202Z-22352e",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
