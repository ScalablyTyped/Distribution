organization := "org.scalablytyped"
name := "cucumber__cucumber"
version := "9.1.2-79a461"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cucumber__cucumber-expressions" % "16.1.2-165605",
  "org.scalablytyped" %%% "cucumber__messages" % "22.0.0-f15274",
  "org.scalablytyped" %%% "error-stack-parser" % "2.1.4-6aaaa9",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20211202Z-b9b2c7",
  "org.scalablytyped" %%% "regexp-match-indices" % "1.0.2-e730b3",
  "org.scalablytyped" %%% "regexp-tree" % "0.1.24-63a62c",
  "org.scalablytyped" %%% "stackframe" % "1.3.4-815837",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
