organization := "org.scalablytyped"
name := "conventional-changelog-preset-loader"
version := "2.3-dt-20220624Z-4bafbe"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "conventional-changelog-core" % "4.2-dt-20211216Z-fb2727",
  "org.scalablytyped" %%% "conventional-changelog-writer" % "4.0-dt-20220624Z-5449ec",
  "org.scalablytyped" %%% "conventional-commits-parser" % "3.0-dt-20211202Z-199283",
  "org.scalablytyped" %%% "conventional-recommended-bump" % "6.1-dt-20220624Z-08635c",
  "org.scalablytyped" %%% "git-raw-commits" % "2.0-dt-20220624Z-b7cb38",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20211202Z-066477",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
