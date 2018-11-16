package typings
package d3DashCloudLib.d3Mod.layoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cloud[T /* <: d3DashCloudLib.d3Mod.layoutNs.cloudNs.Word */] extends js.Object {
  def font(): js.Function2[/* datum */ T, /* index */ scala.Double, java.lang.String] = js.native
  def font(font: java.lang.String): Cloud[T] = js.native
  def font(font: js.Function2[/* datum */ T, /* index */ scala.Double, java.lang.String]): Cloud[T] = js.native
  def fontSize(): js.Function2[/* datum */ T, /* index */ scala.Double, scala.Double] = js.native
  def fontSize(size: js.Function2[/* datum */ T, /* index */ scala.Double, scala.Double]): Cloud[T] = js.native
  def fontSize(size: scala.Double): Cloud[T] = js.native
  def fontStyle(): js.Function2[/* datum */ T, /* index */ scala.Double, java.lang.String] = js.native
  def fontStyle(style: java.lang.String): Cloud[T] = js.native
  def fontStyle(style: js.Function2[/* datum */ T, /* index */ scala.Double, java.lang.String]): Cloud[T] = js.native
  def fontWeight(): js.Function2[/* datum */ T, /* index */ scala.Double, java.lang.String | scala.Double] = js.native
  def fontWeight(weight: java.lang.String): Cloud[T] = js.native
  def fontWeight(weight: js.Function2[/* datum */ T, /* index */ scala.Double, java.lang.String | scala.Double]): Cloud[T] = js.native
  def fontWeight(weight: scala.Double): Cloud[T] = js.native
  def on(`type`: java.lang.String): js.Function1[/* repeated */js.Any, scala.Unit] = js.native
  def on(`type`: java.lang.String, listener: js.Function1[/* repeated */js.Any, scala.Unit]): Cloud[T] = js.native
  @JSName("on")
  def on_end(`type`: d3DashCloudLib.d3DashCloudLibStrings.end): js.Function2[/* tags */ js.Array[T], /* bounds */ js.Array[d3DashCloudLib.Anon_Y], scala.Unit] = js.native
  @JSName("on")
  def on_end(
    `type`: d3DashCloudLib.d3DashCloudLibStrings.end,
    listener: js.Function2[/* tags */ js.Array[T], /* bounds */ js.Array[d3DashCloudLib.Anon_Y], scala.Unit]
  ): Cloud[T] = js.native
  @JSName("on")
  def on_word(`type`: d3DashCloudLib.d3DashCloudLibStrings.word): js.Function1[/* word */ T, scala.Unit] = js.native
  @JSName("on")
  def on_word(
    `type`: d3DashCloudLib.d3DashCloudLibStrings.word,
    listener: js.Function1[/* word */ T, scala.Unit]
  ): Cloud[T] = js.native
  def padding(): js.Function2[/* datum */ T, /* index */ scala.Double, scala.Double] = js.native
  def padding(padding: js.Function2[/* datum */ T, /* index */ scala.Double, scala.Double]): Cloud[T] = js.native
  def padding(padding: scala.Double): Cloud[T] = js.native
  def rotate(): js.Function2[/* datum */ T, /* index */ scala.Double, scala.Double] = js.native
  def rotate(rotate: js.Function2[/* datum */ T, /* index */ scala.Double, scala.Double]): Cloud[T] = js.native
  def rotate(rotate: scala.Double): Cloud[T] = js.native
  def size(): js.Tuple2[scala.Double, scala.Double] = js.native
  def size(size: js.Tuple2[scala.Double, scala.Double]): Cloud[T] = js.native
  def spiral(): js.Function1[
    /* size */ scala.Double, 
    js.Function1[/* t */ scala.Double, js.Tuple2[scala.Double, scala.Double]]
  ] = js.native
  def spiral(name: java.lang.String): Cloud[T] = js.native
  def spiral(
    spiral: js.Function1[
      /* size */ scala.Double, 
      js.Function1[/* t */ scala.Double, js.Tuple2[scala.Double, scala.Double]]
    ]
  ): Cloud[T] = js.native
  def start(): Cloud[T] = js.native
  def stop(): Cloud[T] = js.native
  def text(): js.Function2[/* datum */ T, /* index */ scala.Double, java.lang.String] = js.native
  def text(text: java.lang.String): Cloud[T] = js.native
  def text(text: js.Function2[/* datum */ T, /* index */ scala.Double, java.lang.String]): Cloud[T] = js.native
  def timeInterval(): scala.Double = js.native
  def timeInterval(interval: scala.Double): Cloud[T] = js.native
  def words(): js.Array[T] = js.native
  def words(words: js.Array[T]): Cloud[T] = js.native
}

