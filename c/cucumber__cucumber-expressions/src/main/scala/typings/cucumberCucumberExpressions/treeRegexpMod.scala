package typings.cucumberCucumberExpressions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeRegexpMod {
  
  @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/TreeRegexp", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TreeRegexp {
    def this(regexp: String) = this()
    def this(regexp: js.RegExp) = this()
    
    /* CompleteClass */
    override val groupBuilder: typings.cucumberCucumberExpressions.groupBuilderMod.default = js.native
    
    /* CompleteClass */
    override def `match`(s: String): typings.cucumberCucumberExpressions.groupMod.default | Null = js.native
    
    /* CompleteClass */
    override val regexp: js.RegExp = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/TreeRegexp", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/TreeRegexp", "default.createGroupBuilder")
    @js.native
    def createGroupBuilder: Any = js.native
    inline def createGroupBuilder_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createGroupBuilder")(x.asInstanceOf[js.Any])
    
    @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/TreeRegexp", "default.isNonCapturing")
    @js.native
    def isNonCapturing: Any = js.native
    inline def isNonCapturing_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isNonCapturing")(x.asInstanceOf[js.Any])
  }
  
  trait TreeRegexp extends StObject {
    
    val groupBuilder: typings.cucumberCucumberExpressions.groupBuilderMod.default
    
    def `match`(s: String): typings.cucumberCucumberExpressions.groupMod.default | Null
    
    val regexp: js.RegExp
  }
  object TreeRegexp {
    
    inline def apply(
      groupBuilder: typings.cucumberCucumberExpressions.groupBuilderMod.default,
      `match`: String => typings.cucumberCucumberExpressions.groupMod.default | Null,
      regexp: js.RegExp
    ): TreeRegexp = {
      val __obj = js.Dynamic.literal(groupBuilder = groupBuilder.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
      __obj.asInstanceOf[TreeRegexp]
    }
    
    extension [Self <: TreeRegexp](x: Self) {
      
      inline def setGroupBuilder(value: typings.cucumberCucumberExpressions.groupBuilderMod.default): Self = StObject.set(x, "groupBuilder", value.asInstanceOf[js.Any])
      
      inline def setMatch(value: String => typings.cucumberCucumberExpressions.groupMod.default | Null): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
      
      inline def setRegexp(value: js.RegExp): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
    }
  }
}
