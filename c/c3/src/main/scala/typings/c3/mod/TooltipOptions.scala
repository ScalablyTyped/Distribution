package typings.c3.mod

import typings.c3.anon.Left
import typings.c3.anon.Name
import typings.c3.anon.PositionShow
import typings.c3.c3Strings.asc
import typings.c3.c3Strings.desc
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipOptions extends js.Object {
  
  /**
    * Set custom HTML for the tooltip.
    * @param data If `tooltip.grouped` is true, data includes multiple data points.
    */
  var contents: js.UndefOr[
    js.ThisFunction4[
      /* this */ ChartInternal, 
      /* data */ js.Array[DataPoint], 
      /* defaultTitleFormat */ js.Function1[/* repeated */ js.Any, _], 
      /* defaultValueFormat */ js.Function1[/* repeated */ js.Any, _], 
      /* color */ js.Function1[/* repeated */ js.Any, _], 
      String
    ]
  ] = js.native
  
  var format: js.UndefOr[Name] = js.native
  
  /**
    * Set if tooltip is grouped or not for the data points.
    * Defaults to `true`.
    */
  var grouped: js.UndefOr[Boolean] = js.native
  
  /** Show the tooltips based on the horizontal position of the mouse. */
  var horizontal: js.UndefOr[Boolean] = js.native
  
  var init: js.UndefOr[PositionShow] = js.native
  
  /**
    * Set tooltip values order.
    */
  var order: js.UndefOr[
    desc | asc | js.Array[_] | (js.Function2[/* data1 */ js.Any, /* data2 */ js.Any, Double]) | Null
  ] = js.native
  
  /**
    * Set custom position for the tooltip. This option can be used to modify the tooltip position by returning object that has top and left.
    */
  var position: js.UndefOr[
    js.ThisFunction4[
      /* this */ ChartInternal, 
      /* data */ Primitive, 
      /* width */ Double, 
      /* height */ Double, 
      /* element */ SVGElement, 
      Left
    ]
  ] = js.native
  
  /**
    * Show or hide tooltip.
    * Defaults to `true`.
    */
  var show: js.UndefOr[Boolean] = js.native
}
object TooltipOptions {
  
  @scala.inline
  def apply(): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipOptions]
  }
  
  @scala.inline
  implicit class TooltipOptionsOps[Self <: TooltipOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContents(
      value: js.ThisFunction4[
          /* this */ ChartInternal, 
          /* data */ js.Array[DataPoint], 
          /* defaultTitleFormat */ js.Function1[/* repeated */ js.Any, _], 
          /* defaultValueFormat */ js.Function1[/* repeated */ js.Any, _], 
          /* color */ js.Function1[/* repeated */ js.Any, _], 
          String
        ]
    ): Self = this.set("contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContents: Self = this.set("contents", js.undefined)
    
    @scala.inline
    def setFormat(value: Name): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setGrouped(value: Boolean): Self = this.set("grouped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrouped: Self = this.set("grouped", js.undefined)
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    
    @scala.inline
    def setInit(value: PositionShow): Self = this.set("init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    
    @scala.inline
    def setOrderFunction2(value: (/* data1 */ js.Any, /* data2 */ js.Any) => Double): Self = this.set("order", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOrderVarargs(value: js.Any*): Self = this.set("order", js.Array(value :_*))
    
    @scala.inline
    def setOrder(value: desc | asc | js.Array[_] | (js.Function2[/* data1 */ js.Any, /* data2 */ js.Any, Double])): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setOrderNull: Self = this.set("order", null)
    
    @scala.inline
    def setPosition(
      value: js.ThisFunction4[
          /* this */ ChartInternal, 
          /* data */ Primitive, 
          /* width */ Double, 
          /* height */ Double, 
          /* element */ SVGElement, 
          Left
        ]
    ): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
}
