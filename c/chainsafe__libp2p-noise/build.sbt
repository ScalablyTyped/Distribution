organization := "org.scalablytyped"
name := "chainsafe__libp2p-noise"
version := "8.0.1-441fe3"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "it-length-prefixed" % "8.0.2-258040",
  "org.scalablytyped" %%% "it-pb-stream" % "2.0.2-a616a8",
  "org.scalablytyped" %%% "it-reader" % "6.0.1-b81d1a",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-6c7d9c",
  "org.scalablytyped" %%% "libp2p__interface-connection-encrypter" % "2.0.1-96e8b6",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.4-67a580",
  "org.scalablytyped" %%% "libp2p__logger" % "2.0.1-153927",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "protons-runtime" % "3.1.0-454eac",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.2-03f09d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
