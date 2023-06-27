organization := "org.scalablytyped"
name := "datatables_dot_net-rowgroup"
version := "1.1-dt-20211202Z-a1e904"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "datatables_dot_net" % "1.10-dt-20220924Z-9f3a0d",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20221231Z-11244e",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-ee1324",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
