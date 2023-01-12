package typings.bemCn

import org.scalablytyped.runtime.StringDictionary
import typings.bemCn.anon.PartialBemSettings
import typings.bemCn.anon.ToString
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bem-cn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bem-cn", JSImport.Default)
  @js.native
  val default: BemCn = js.native
  
  @JSImport("bem-cn", "ERROR_BLOCK_NAME_EMPTY")
  @js.native
  val ERROR_BLOCK_NAME_EMPTY: /* "Block name should be non-empty" */ String = js.native
  
  @JSImport("bem-cn", "ERROR_BLOCK_NAME_TYPE")
  @js.native
  val ERROR_BLOCK_NAME_TYPE: /* "Block name should be a string" */ String = js.native
  
  @JSImport("bem-cn", "block")
  @js.native
  val block: BemCn = js.native
  
  inline def setup(): BemCn = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")().asInstanceOf[BemCn]
  inline def setup(settings: PartialBemSettings): BemCn = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")(settings.asInstanceOf[js.Any]).asInstanceOf[BemCn]
  
  type BemBlock = js.Function3[
    /* settings */ BemSettings, 
    /* context */ BemContext, 
    /* repeated */ String | BemMods, 
    BemItem | String
  ]
  
  type BemCn = js.Function1[/* blockName */ String, Block_]
  
  trait BemContext extends StObject {
    
    var mixes: js.Array[BemMix]
    
    var mods: BemMods
    
    var name: String
    
    var states: BemStates
  }
  object BemContext {
    
    inline def apply(mixes: js.Array[BemMix], mods: BemMods, name: String, states: BemStates): BemContext = {
      val __obj = js.Dynamic.literal(mixes = mixes.asInstanceOf[js.Any], mods = mods.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
      __obj.asInstanceOf[BemContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BemContext] (val x: Self) extends AnyVal {
      
      inline def setMixes(value: js.Array[BemMix]): Self = StObject.set(x, "mixes", value.asInstanceOf[js.Any])
      
      inline def setMixesVarargs(value: BemMix*): Self = StObject.set(x, "mixes", js.Array(value*))
      
      inline def setMods(value: BemMods): Self = StObject.set(x, "mods", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStates(value: BemStates): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BemItem extends StObject {
    
    def has(state: BemState): BemItem & String = js.native
    
    def is(state: BemState): BemItem & String = js.native
    
    def mix(mix: BemMix*): BemItem & String = js.native
    
    def split(): BemItem & String = js.native
    def split(separator: String): BemItem & String = js.native
    def split(separator: String, limit: Double): BemItem & String = js.native
    def split(separator: Unit, limit: Double): BemItem & String = js.native
    
    def state(state: BemState): BemItem & String = js.native
  }
  
  type BemMix = js.UndefOr[String | js.Array[String] | BemBlock | ToString]
  
  type BemMods = StringDictionary[String | Boolean | Any]
  
  trait BemSettings extends StObject {
    
    var classMap: js.UndefOr[Record[String, String]] = js.undefined
    
    var el: String
    
    var mod: String
    
    var modValue: String
    
    var ns: js.UndefOr[String] = js.undefined
  }
  object BemSettings {
    
    inline def apply(el: String, mod: String, modValue: String): BemSettings = {
      val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], mod = mod.asInstanceOf[js.Any], modValue = modValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[BemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BemSettings] (val x: Self) extends AnyVal {
      
      inline def setClassMap(value: Record[String, String]): Self = StObject.set(x, "classMap", value.asInstanceOf[js.Any])
      
      inline def setClassMapUndefined: Self = StObject.set(x, "classMap", js.undefined)
      
      inline def setEl(value: String): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setMod(value: String): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
      
      inline def setModValue(value: String): Self = StObject.set(x, "modValue", value.asInstanceOf[js.Any])
      
      inline def setNs(value: String): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
      
      inline def setNsUndefined: Self = StObject.set(x, "ns", js.undefined)
    }
  }
  
  type BemState = Record[String, Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.bemCn.bemCnStrings.`is-`
    - typings.bemCn.bemCnStrings.`has-`
  */
  trait BemStatePrefix extends StObject
  object BemStatePrefix {
    
    inline def `has-`: typings.bemCn.bemCnStrings.`has-` = "has-".asInstanceOf[typings.bemCn.bemCnStrings.`has-`]
    
    inline def `is-`: typings.bemCn.bemCnStrings.`is-` = "is-".asInstanceOf[typings.bemCn.bemCnStrings.`is-`]
  }
  
  /* Inlined std.Record<bem-cn.bem-cn.BemStatePrefix, bem-cn.bem-cn.BemState> */
  trait BemStates extends StObject {
    
    var `has-`: BemState
    
    var `is-`: BemState
  }
  object BemStates {
    
    inline def apply(`has-`: BemState, `is-`: BemState): BemStates = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("has-")(`has-`.asInstanceOf[js.Any])
      __obj.updateDynamic("is-")(`is-`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BemStates]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BemStates] (val x: Self) extends AnyVal {
      
      inline def `setHas-`(value: BemState): Self = StObject.set(x, "has-", value.asInstanceOf[js.Any])
      
      inline def `setIs-`(value: BemState): Self = StObject.set(x, "is-", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Block_
    extends StObject
       with IBlock
       with typings.std.String {
    
    /**
      * Split a string into substrings using the specified separator and return them as an array.
      * @param separator A string that identifies character or characters to use in separating the string. If omitted, a single-element array containing the entire string is returned.
      * @param limit A value used to limit the number of elements returned in the array.
      */
    /* standard es5 */
    /* InferMemberOverrides */
    override def split(separator: String): js.Array[String] & BemItem & String = js.native
    /* InferMemberOverrides */
    override def split(separator: String, limit: Double): js.Array[String] & BemItem & String = js.native
  }
  
  @js.native
  trait IBlock
    extends StObject
       with BemItem {
    
    def apply(elemNameOrMods: (String | BemMods)*): BemItem & String = js.native
  }
}
