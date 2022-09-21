package typings.codemirrorState.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FacetConfig[Input, Output] extends StObject {
  
  /**
    How to combine the input values into a single output value. When
    not given, the array of input values becomes the output. This
    function will immediately be called on creating the facet, with
    an empty array, to compute the facet's default value when no
    inputs are present.
    */
  var combine: js.UndefOr[js.Function1[/* value */ js.Array[Input], Output]] = js.undefined
  
  /**
    How to compare output values to determine whether the value of
    the facet changed. Defaults to comparing by `===` or, if no
    `combine` function was given, comparing each element of the
    array with `===`.
    */
  var compare: js.UndefOr[js.Function2[/* a */ Output, /* b */ Output, Boolean]] = js.undefined
  
  /**
    How to compare input values to avoid recomputing the output
    value when no inputs changed. Defaults to comparing with `===`.
    */
  var compareInput: js.UndefOr[js.Function2[/* a */ Input, /* b */ Input, Boolean]] = js.undefined
  
  /**
    If given, these extension(s) (or the result of calling the given
    function with the facet) will be added to any state where this
    facet is provided. (Note that, while a facet's default value can
    be read from a state even if the facet wasn't present in the
    state at all, these extensions won't be added in that
    situation.)
    */
  var enables: js.UndefOr[Extension | (js.Function1[/* self */ Facet[Input, Output], Extension])] = js.undefined
  
  /**
    Forbids dynamic inputs to this facet.
    */
  var static: js.UndefOr[Boolean] = js.undefined
}
object FacetConfig {
  
  inline def apply[Input, Output](): FacetConfig[Input, Output] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FacetConfig[Input, Output]]
  }
  
  extension [Self <: FacetConfig[?, ?], Input, Output](x: Self & (FacetConfig[Input, Output])) {
    
    inline def setCombine(value: /* value */ js.Array[Input] => Output): Self = StObject.set(x, "combine", js.Any.fromFunction1(value))
    
    inline def setCombineUndefined: Self = StObject.set(x, "combine", js.undefined)
    
    inline def setCompare(value: (/* a */ Output, /* b */ Output) => Boolean): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
    
    inline def setCompareInput(value: (/* a */ Input, /* b */ Input) => Boolean): Self = StObject.set(x, "compareInput", js.Any.fromFunction2(value))
    
    inline def setCompareInputUndefined: Self = StObject.set(x, "compareInput", js.undefined)
    
    inline def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
    
    inline def setEnables(value: Extension | (js.Function1[/* self */ Facet[Input, Output], Extension])): Self = StObject.set(x, "enables", value.asInstanceOf[js.Any])
    
    inline def setEnablesFunction1(value: /* self */ Facet[Input, Output] => Extension): Self = StObject.set(x, "enables", js.Any.fromFunction1(value))
    
    inline def setEnablesUndefined: Self = StObject.set(x, "enables", js.undefined)
    
    inline def setEnablesVarargs(value: Any*): Self = StObject.set(x, "enables", js.Array(value*))
    
    inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
  }
}
