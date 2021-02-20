package typings.bizcharts.mod

import typings.antvG2.mod.Styles.line
import typings.antvG2.mod.Styles.text
import typings.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelProps
  extends Props[js.Any] {
  
  var autoRotate: js.UndefOr[Boolean] = js.native
  
  var content: js.UndefOr[
    String | (js.Tuple2[String, js.Function2[/* x */ js.UndefOr[_], /* y */ js.UndefOr[_], String]])
  ] = js.native
  
  var formatter: js.UndefOr[
    (js.Function3[
      /* text */ js.UndefOr[js.Any], 
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      String
    ]) | Double
  ] = js.native
  
  var htmlTemplate: js.UndefOr[
    (js.Function3[
      /* text */ js.UndefOr[js.Any], 
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      String
    ]) | String
  ] = js.native
  
  var labelEmit: js.UndefOr[Boolean] = js.native
  
  var labelLine: js.UndefOr[
    (js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], line]) | line | Boolean
  ] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var textStyle: js.UndefOr[text | (js.Function1[/* t */ js.UndefOr[js.Any], text])] = js.native
}
object LabelProps {
  
  @scala.inline
  def apply(): LabelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelProps]
  }
  
  @scala.inline
  implicit class LabelPropsMutableBuilder[Self <: LabelProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoRotate(value: Boolean): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRotateUndefined: Self = StObject.set(x, "autoRotate", js.undefined)
    
    @scala.inline
    def setContent(
      value: String | (js.Tuple2[String, js.Function2[/* x */ js.UndefOr[_], /* y */ js.UndefOr[_], String]])
    ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setFormatter(
      value: (js.Function3[
          /* text */ js.UndefOr[js.Any], 
          /* item */ js.UndefOr[js.Any], 
          /* index */ js.UndefOr[Double], 
          String
        ]) | Double
    ): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatterFunction3(
      value: (/* text */ js.UndefOr[js.Any], /* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double]) => String
    ): Self = StObject.set(x, "formatter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    @scala.inline
    def setHtmlTemplate(
      value: (js.Function3[
          /* text */ js.UndefOr[js.Any], 
          /* item */ js.UndefOr[js.Any], 
          /* index */ js.UndefOr[Double], 
          String
        ]) | String
    ): Self = StObject.set(x, "htmlTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlTemplateFunction3(
      value: (/* text */ js.UndefOr[js.Any], /* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double]) => String
    ): Self = StObject.set(x, "htmlTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHtmlTemplateUndefined: Self = StObject.set(x, "htmlTemplate", js.undefined)
    
    @scala.inline
    def setLabelEmit(value: Boolean): Self = StObject.set(x, "labelEmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelEmitUndefined: Self = StObject.set(x, "labelEmit", js.undefined)
    
    @scala.inline
    def setLabelLine(
      value: (js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], line]) | line | Boolean
    ): Self = StObject.set(x, "labelLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelLineFunction2(value: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any]) => line): Self = StObject.set(x, "labelLine", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLabelLineUndefined: Self = StObject.set(x, "labelLine", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setTextStyle(value: text | (js.Function1[/* t */ js.UndefOr[js.Any], text])): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleFunction1(value: /* t */ js.UndefOr[js.Any] => text): Self = StObject.set(x, "textStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
