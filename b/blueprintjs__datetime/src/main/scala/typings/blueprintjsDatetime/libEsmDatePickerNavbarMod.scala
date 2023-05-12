package typings.blueprintjsDatetime

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmDatePickerNavbarMod {
  
  @JSImport("@blueprintjs/datetime/lib/esm/datePickerNavbar", "DatePickerNavbar")
  @js.native
  open class DatePickerNavbar protected ()
    extends PureComponent[IDatePickerNavbarProps, js.Object, Any] {
    def this(props: IDatePickerNavbarProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: IDatePickerNavbarProps, context: Any) = this()
    
    /* private */ var handleNextClick: Any = js.native
    
    /* private */ var handlePreviousClick: Any = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavbarElementProps * / any */ trait IDatePickerNavbarProps extends StObject {
    
    var hideLeftNavButton: js.UndefOr[Boolean] = js.undefined
    
    var hideRightNavButton: js.UndefOr[Boolean] = js.undefined
    
    var maxDate: js.Date
    
    var minDate: js.Date
  }
  object IDatePickerNavbarProps {
    
    inline def apply(maxDate: js.Date, minDate: js.Date): IDatePickerNavbarProps = {
      val __obj = js.Dynamic.literal(maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDatePickerNavbarProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDatePickerNavbarProps] (val x: Self) extends AnyVal {
      
      inline def setHideLeftNavButton(value: Boolean): Self = StObject.set(x, "hideLeftNavButton", value.asInstanceOf[js.Any])
      
      inline def setHideLeftNavButtonUndefined: Self = StObject.set(x, "hideLeftNavButton", js.undefined)
      
      inline def setHideRightNavButton(value: Boolean): Self = StObject.set(x, "hideRightNavButton", value.asInstanceOf[js.Any])
      
      inline def setHideRightNavButtonUndefined: Self = StObject.set(x, "hideRightNavButton", js.undefined)
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    }
  }
}
