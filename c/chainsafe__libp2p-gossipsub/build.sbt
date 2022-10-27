organization := "org.scalablytyped"
name := "chainsafe__libp2p-gossipsub"
version := "5.0.0-642a3a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "denque" % "2.1.0-758dab",
  "org.scalablytyped" %%% "dns-over-http-resolver" % "2.1.0-011631",
  "org.scalablytyped" %%% "it-pushable" % "3.1.0-52a3a3",
  "org.scalablytyped" %%% "it-stream-types" % "1.0.4-43f797",
  "org.scalablytyped" %%% "libp2p__interface-connection" % "3.0.2-7c4942",
  "org.scalablytyped" %%% "libp2p__interface-connection-manager" % "1.3.0-5a070c",
  "org.scalablytyped" %%% "libp2p__interface-keys" % "1.0.3-d46e3b",
  "org.scalablytyped" %%% "libp2p__interface-peer-id" % "1.0.5-22c095",
  "org.scalablytyped" %%% "libp2p__interface-peer-info" % "1.0.3-66399b",
  "org.scalablytyped" %%% "libp2p__interface-peer-store" % "1.2.2-adc942",
  "org.scalablytyped" %%% "libp2p__interface-pubsub" % "3.0.0-419879",
  "org.scalablytyped" %%% "libp2p__interface-record" % "2.0.1-9c1936",
  "org.scalablytyped" %%% "libp2p__interface-registrar" % "2.0.3-44aafe",
  "org.scalablytyped" %%% "libp2p__interfaces" % "3.0.3-5a062f",
  "org.scalablytyped" %%% "multiformats" % "10.0.2-cc7cca",
  "org.scalablytyped" %%% "multiformats__multiaddr" % "11.0.5-d92aed",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-fe2613",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "uint8arraylist" % "2.3.3-bed8fc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
