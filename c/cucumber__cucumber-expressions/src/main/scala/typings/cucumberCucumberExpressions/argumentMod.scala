package typings.cucumberCucumberExpressions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object argumentMod {
  
  @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/Argument", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Argument {
    def this(
      group: typings.cucumberCucumberExpressions.groupMod.default,
      parameterType: typings.cucumberCucumberExpressions.parameterTypeMod.default[Any]
    ) = this()
    
    /* CompleteClass */
    override def getParameterType(): typings.cucumberCucumberExpressions.parameterTypeMod.default[Any] = js.native
    
    /**
      * Get the value returned by the parameter type's transformer function.
      *
      * @param thisObj the object in which the transformer function is applied.
      */
    /* CompleteClass */
    override def getValue[T](thisObj: Any): T | Null = js.native
    
    /* CompleteClass */
    override val group: typings.cucumberCucumberExpressions.groupMod.default = js.native
    
    /* CompleteClass */
    override val parameterType: typings.cucumberCucumberExpressions.parameterTypeMod.default[Any] = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/Argument", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def build(
      group: typings.cucumberCucumberExpressions.groupMod.default,
      parameterTypes: js.Array[typings.cucumberCucumberExpressions.parameterTypeMod.default[Any]]
    ): js.Array[Argument] = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(group.asInstanceOf[js.Any], parameterTypes.asInstanceOf[js.Any])).asInstanceOf[js.Array[Argument]]
  }
  
  trait Argument extends StObject {
    
    def getParameterType(): typings.cucumberCucumberExpressions.parameterTypeMod.default[Any]
    
    /**
      * Get the value returned by the parameter type's transformer function.
      *
      * @param thisObj the object in which the transformer function is applied.
      */
    def getValue[T](thisObj: Any): T | Null
    
    val group: typings.cucumberCucumberExpressions.groupMod.default
    
    val parameterType: typings.cucumberCucumberExpressions.parameterTypeMod.default[Any]
  }
  object Argument {
    
    inline def apply(
      getParameterType: () => typings.cucumberCucumberExpressions.parameterTypeMod.default[Any],
      getValue: Any => Any | Null,
      group: typings.cucumberCucumberExpressions.groupMod.default,
      parameterType: typings.cucumberCucumberExpressions.parameterTypeMod.default[Any]
    ): Argument = {
      val __obj = js.Dynamic.literal(getParameterType = js.Any.fromFunction0(getParameterType), getValue = js.Any.fromFunction1(getValue), group = group.asInstanceOf[js.Any], parameterType = parameterType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argument]
    }
    
    extension [Self <: Argument](x: Self) {
      
      inline def setGetParameterType(value: () => typings.cucumberCucumberExpressions.parameterTypeMod.default[Any]): Self = StObject.set(x, "getParameterType", js.Any.fromFunction0(value))
      
      inline def setGetValue(value: Any => Any | Null): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
      
      inline def setGroup(value: typings.cucumberCucumberExpressions.groupMod.default): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setParameterType(value: typings.cucumberCucumberExpressions.parameterTypeMod.default[Any]): Self = StObject.set(x, "parameterType", value.asInstanceOf[js.Any])
    }
  }
}
