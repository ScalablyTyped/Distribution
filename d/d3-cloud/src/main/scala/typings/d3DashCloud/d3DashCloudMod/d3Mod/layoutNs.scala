package typings.d3DashCloud.d3DashCloudMod.d3Mod

import typings.d3DashCloud.Anon_X
import typings.d3DashCloud.d3DashCloudMod.d3Mod.layoutNs.Cloud
import typings.d3DashCloud.d3DashCloudMod.d3Mod.layoutNs.cloudNs.Word
import typings.d3DashCloud.d3DashCloudStrings.end
import typings.d3DashCloud.d3DashCloudStrings.word
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-cloud/d3", "layout")
@js.native
object layoutNs extends js.Object {
  @js.native
  trait Cloud[T /* <: Word */] extends js.Object {
    /**
      * If specified, sets the canvas generator function, which is used internally to draw text.
      * When using Node.js, you will almost definitely override the default, e.g. using the canvas module.
      * @param canvasGenerator should return a HTMLCanvasElement.The default is:  ()=>{document.createElement("canvas");}
      * 
      */
    def canvas(): Cloud[T] = js.native
    def canvas(canvasGenerator: js.Function0[HTMLCanvasElement]): Cloud[T] = js.native
    def font(): js.Function2[/* datum */ T, /* index */ Double, String] = js.native
    def font(font: String): Cloud[T] = js.native
    def font(font: js.Function2[/* datum */ T, /* index */ Double, String]): Cloud[T] = js.native
    def fontSize(): js.Function2[/* datum */ T, /* index */ Double, Double] = js.native
    def fontSize(size: js.Function2[/* datum */ T, /* index */ Double, Double]): Cloud[T] = js.native
    def fontSize(size: Double): Cloud[T] = js.native
    def fontStyle(): js.Function2[/* datum */ T, /* index */ Double, String] = js.native
    def fontStyle(style: String): Cloud[T] = js.native
    def fontStyle(style: js.Function2[/* datum */ T, /* index */ Double, String]): Cloud[T] = js.native
    def fontWeight(): js.Function2[/* datum */ T, /* index */ Double, String | Double] = js.native
    def fontWeight(weight: String): Cloud[T] = js.native
    def fontWeight(weight: js.Function2[/* datum */ T, /* index */ Double, String | Double]): Cloud[T] = js.native
    def fontWeight(weight: Double): Cloud[T] = js.native
    def on(`type`: String): js.Function1[/* repeated */ js.Any, Unit] = js.native
    def on(`type`: String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cloud[T] = js.native
    @JSName("on")
    def on_end(`type`: end): js.Function2[/* tags */ js.Array[T], /* bounds */ js.Array[Anon_X], Unit] = js.native
    @JSName("on")
    def on_end(`type`: end, listener: js.Function2[/* tags */ js.Array[T], /* bounds */ js.Array[Anon_X], Unit]): Cloud[T] = js.native
    @JSName("on")
    def on_word(`type`: word): js.Function1[/* word */ T, Unit] = js.native
    @JSName("on")
    def on_word(`type`: word, listener: js.Function1[/* word */ T, Unit]): Cloud[T] = js.native
    def padding(): js.Function2[/* datum */ T, /* index */ Double, Double] = js.native
    def padding(padding: js.Function2[/* datum */ T, /* index */ Double, Double]): Cloud[T] = js.native
    def padding(padding: Double): Cloud[T] = js.native
    /**
      * If specified, sets the internal random number generator,used for selecting the initial position of each word,
      * and the clockwise/counterclockwise direction of the spiral for each word.
      * 
      * @param randomFunction should return a number in the range [0, 1).The default is Math.random.
      */
    def random(): Cloud[T] = js.native
    def random(randomFunction: js.Function0[Double]): Cloud[T] = js.native
    def rotate(): js.Function2[/* datum */ T, /* index */ Double, Double] = js.native
    def rotate(rotate: js.Function2[/* datum */ T, /* index */ Double, Double]): Cloud[T] = js.native
    def rotate(rotate: Double): Cloud[T] = js.native
    def size(): js.Tuple2[Double, Double] = js.native
    def size(size: js.Tuple2[Double, Double]): Cloud[T] = js.native
    def spiral(): js.Function1[/* size */ Double, js.Function1[/* t */ Double, js.Tuple2[Double, Double]]] = js.native
    def spiral(name: String): Cloud[T] = js.native
    def spiral(spiral: js.Function1[/* size */ Double, js.Function1[/* t */ Double, js.Tuple2[Double, Double]]]): Cloud[T] = js.native
    def start(): Cloud[T] = js.native
    def stop(): Cloud[T] = js.native
    def text(): js.Function2[/* datum */ T, /* index */ Double, String] = js.native
    def text(text: String): Cloud[T] = js.native
    def text(text: js.Function2[/* datum */ T, /* index */ Double, String]): Cloud[T] = js.native
    def timeInterval(): Double = js.native
    def timeInterval(interval: Double): Cloud[T] = js.native
    def words(): js.Array[T] = js.native
    def words(words: js.Array[T]): Cloud[T] = js.native
  }
  
  def cloud(): Cloud[Word] = js.native
  @JSName("cloud")
  def cloud_T_Word[T /* <: Word */](): Cloud[T] = js.native
  @JSName("cloud")
  @js.native
  object cloudNs extends js.Object {
    trait Word extends js.Object {
      var font: js.UndefOr[String] = js.undefined
      var padding: js.UndefOr[Double] = js.undefined
      var rotate: js.UndefOr[Double] = js.undefined
      var size: js.UndefOr[Double] = js.undefined
      var style: js.UndefOr[String] = js.undefined
      var text: js.UndefOr[String] = js.undefined
      var weight: js.UndefOr[String | Double] = js.undefined
      var x: js.UndefOr[Double] = js.undefined
      var y: js.UndefOr[Double] = js.undefined
    }
    
  }
  
}

