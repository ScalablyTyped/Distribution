package typings
package d3DashCloudLib.d3DashCloudMod.d3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-cloud/d3", "layout")
@js.native
object layoutNs extends js.Object {
  @js.native
  trait Cloud[T /* <: d3DashCloudLib.d3DashCloudMod.d3Mod.layoutNs.cloudNs.Word */] extends js.Object {
    /**
      * If specified, sets the canvas generator function, which is used internally to draw text.
      * When using Node.js, you will almost definitely override the default, e.g. using the canvas module.
      * @param canvasGenerator should return a HTMLCanvasElement.The default is:  ()=>{document.createElement("canvas");}
      * 
      */
    def canvas(): Cloud[T] = js.native
    def canvas(canvasGenerator: js.Function0[stdLib.HTMLCanvasElement]): Cloud[T] = js.native
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
    def on(`type`: java.lang.String): js.Function1[/* repeated */ js.Any, scala.Unit] = js.native
    def on(`type`: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): Cloud[T] = js.native
    @JSName("on")
    def on_end(`type`: d3DashCloudLib.d3DashCloudLibStrings.end): js.Function2[/* tags */ js.Array[T], /* bounds */ js.Array[d3DashCloudLib.Anon_X], scala.Unit] = js.native
    @JSName("on")
    def on_end(
      `type`: d3DashCloudLib.d3DashCloudLibStrings.end,
      listener: js.Function2[/* tags */ js.Array[T], /* bounds */ js.Array[d3DashCloudLib.Anon_X], scala.Unit]
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
    /**
      * If specified, sets the internal random number generator,used for selecting the initial position of each word,
      * and the clockwise/counterclockwise direction of the spiral for each word.
      * 
      * @param randomFunction should return a number in the range [0, 1).The default is Math.random.
      */
    def random(): Cloud[T] = js.native
    def random(randomFunction: js.Function0[scala.Double]): Cloud[T] = js.native
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
  
  def cloud(): Cloud[d3DashCloudLib.d3DashCloudMod.d3Mod.layoutNs.cloudNs.Word] = js.native
  @JSName("cloud")
  def cloud_TWord[T /* <: d3DashCloudLib.d3DashCloudMod.d3Mod.layoutNs.cloudNs.Word */](): Cloud[T] = js.native
  @JSName("cloud")
  @js.native
  object cloudNs extends js.Object {
    trait Word extends js.Object {
      var font: js.UndefOr[java.lang.String] = js.undefined
      var padding: js.UndefOr[scala.Double] = js.undefined
      var rotate: js.UndefOr[scala.Double] = js.undefined
      var size: js.UndefOr[scala.Double] = js.undefined
      var style: js.UndefOr[java.lang.String] = js.undefined
      var text: js.UndefOr[java.lang.String] = js.undefined
      var weight: js.UndefOr[java.lang.String | scala.Double] = js.undefined
      var x: js.UndefOr[scala.Double] = js.undefined
      var y: js.UndefOr[scala.Double] = js.undefined
    }
    
  }
  
}

