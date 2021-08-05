package typings.d3Cloud

import typings.d3Cloud.anon.X
import typings.d3Cloud.d3CloudStrings.end
import typings.d3Cloud.d3CloudStrings.word
import typings.d3Cloud.mod.d3AugmentingMod.layout.Cloud_
import typings.d3Cloud.mod.d3AugmentingMod.layout.cloud.Word
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Cloud_[Word] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Cloud_[Word]]
  
  @JSImport("d3-cloud", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* augmented module */
  object d3AugmentingMod {
    
    object layout {
      
      object cloud {
        
        inline def apply(): Cloud_[Word] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Cloud_[Word]]
        
        @JSImport("d3", "layout.cloud")
        @js.native
        val ^ : js.Any = js.native
        
        trait Word extends StObject {
          
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
        object Word {
          
          inline def apply(): Word = {
            val __obj = js.Dynamic.literal()
            __obj.asInstanceOf[Word]
          }
          
          extension [Self <: Word](x: Self) {
            
            inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
            
            inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
            
            inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
            
            inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
            
            inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
            
            inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
            
            inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
            
            inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
            
            inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
            
            inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
            
            inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
            
            inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
            
            inline def setWeight(value: String | Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
            
            inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
            
            inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
            
            inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
            
            inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
            
            inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
          }
        }
      }
      
      @js.native
      trait Cloud_[T /* <: Word */] extends StObject {
        
        /**
          * If specified, sets the canvas generator function, which is used internally to draw text.
          * When using Node.js, you will almost definitely override the default, e.g. using the canvas module.
          * @param canvasGenerator should return a HTMLCanvasElement.The default is:  ()=>{document.createElement("canvas");}
          *
          */
        def canvas(): Cloud_[T] = js.native
        def canvas(canvasGenerator: js.Function0[HTMLCanvasElement]): Cloud_[T] = js.native
        
        def font(): js.Function2[/* datum */ T, /* index */ Double, String] = js.native
        def font(font: String): Cloud_[T] = js.native
        def font(font: js.Function2[/* datum */ T, /* index */ Double, String]): Cloud_[T] = js.native
        
        def fontSize(): js.Function2[/* datum */ T, /* index */ Double, Double] = js.native
        def fontSize(size: js.Function2[/* datum */ T, /* index */ Double, Double]): Cloud_[T] = js.native
        def fontSize(size: Double): Cloud_[T] = js.native
        
        def fontStyle(): js.Function2[/* datum */ T, /* index */ Double, String] = js.native
        def fontStyle(style: String): Cloud_[T] = js.native
        def fontStyle(style: js.Function2[/* datum */ T, /* index */ Double, String]): Cloud_[T] = js.native
        
        def fontWeight(): js.Function2[/* datum */ T, /* index */ Double, String | Double] = js.native
        def fontWeight(weight: String): Cloud_[T] = js.native
        def fontWeight(weight: js.Function2[/* datum */ T, /* index */ Double, String | Double]): Cloud_[T] = js.native
        def fontWeight(weight: Double): Cloud_[T] = js.native
        
        def on(`type`: String): js.Function1[/* repeated */ js.Any, Unit] = js.native
        def on(`type`: String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cloud_[T] = js.native
        @JSName("on")
        def on_end(`type`: end): js.Function2[/* tags */ js.Array[T], /* bounds */ js.Array[X], Unit] = js.native
        @JSName("on")
        def on_end(`type`: end, listener: js.Function2[/* tags */ js.Array[T], /* bounds */ js.Array[X], Unit]): Cloud_[T] = js.native
        @JSName("on")
        def on_word(`type`: word): js.Function1[/* word */ T, Unit] = js.native
        @JSName("on")
        def on_word(`type`: word, listener: js.Function1[/* word */ T, Unit]): Cloud_[T] = js.native
        
        def padding(): js.Function2[/* datum */ T, /* index */ Double, Double] = js.native
        def padding(padding: js.Function2[/* datum */ T, /* index */ Double, Double]): Cloud_[T] = js.native
        def padding(padding: Double): Cloud_[T] = js.native
        
        /**
          * If specified, sets the internal random number generator,used for selecting the initial position of each word,
          * and the clockwise/counterclockwise direction of the spiral for each word.
          *
          * @param randomFunction should return a number in the range [0, 1).The default is Math.random.
          */
        def random(): Cloud_[T] = js.native
        def random(randomFunction: js.Function0[Double]): Cloud_[T] = js.native
        
        def rotate(): js.Function2[/* datum */ T, /* index */ Double, Double] = js.native
        def rotate(rotate: js.Function2[/* datum */ T, /* index */ Double, Double]): Cloud_[T] = js.native
        def rotate(rotate: Double): Cloud_[T] = js.native
        
        def size(): js.Tuple2[Double, Double] = js.native
        def size(size: js.Tuple2[Double, Double]): Cloud_[T] = js.native
        
        def spiral(): js.Function1[
                /* size */ js.Tuple2[Double, Double], 
                js.Function1[/* t */ Double, js.Tuple2[Double, Double]]
              ] = js.native
        def spiral(name: String): Cloud_[T] = js.native
        def spiral(
          spiral: js.Function1[
                  /* size */ js.Tuple2[Double, Double], 
                  js.Function1[/* t */ Double, js.Tuple2[Double, Double]]
                ]
        ): Cloud_[T] = js.native
        
        def start(): Cloud_[T] = js.native
        
        def stop(): Cloud_[T] = js.native
        
        def text(): js.Function2[/* datum */ T, /* index */ Double, String] = js.native
        def text(text: String): Cloud_[T] = js.native
        def text(text: js.Function2[/* datum */ T, /* index */ Double, String]): Cloud_[T] = js.native
        
        def timeInterval(): Double = js.native
        def timeInterval(interval: Double): Cloud_[T] = js.native
        
        def words(): js.Array[T] = js.native
        def words(words: js.Array[T]): Cloud_[T] = js.native
      }
    }
  }
}
