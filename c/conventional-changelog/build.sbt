organization := "org.scalablytyped"
name := "conventional-changelog"
version := "3.1-dt-20211202Z-ff6d45"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "conventional-changelog-core" % "4.2-dt-20211216Z-96027d",
  "org.scalablytyped" %%% "conventional-changelog-writer" % "4.0-dt-20220624Z-14e5e3",
  "org.scalablytyped" %%% "conventional-commits-parser" % "3.0-dt-20211202Z-192d16",
  "org.scalablytyped" %%% "conventional-recommended-bump" % "6.1-dt-20220624Z-f521ae",
  "org.scalablytyped" %%% "git-raw-commits" % "2.0-dt-20220624Z-4c4d85",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20211202Z-180b49",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
