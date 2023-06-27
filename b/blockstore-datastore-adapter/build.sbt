organization := "org.scalablytyped"
name := "blockstore-datastore-adapter"
version := "5.0.0-38dafa"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "blockstore-core" % "4.1.0-d41934",
  "org.scalablytyped" %%% "interface-blockstore" % "5.2.0-1f993a",
  "org.scalablytyped" %%% "interface-datastore" % "8.2.3-b55926",
  "org.scalablytyped" %%% "interface-store" % "5.1.2-2146f1",
  "org.scalablytyped" %%% "it-pushable" % "3.1.3-2836b1",
  "org.scalablytyped" %%% "multiformats" % "11.0.2-431de3",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2",
  "org.scalablytyped" %%% "uint8arrays" % "4.0.3-acd878")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
