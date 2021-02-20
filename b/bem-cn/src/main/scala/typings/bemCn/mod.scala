package typings.bemCn

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.bemCn.anon.PartialBemSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
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
  
  @JSImport("bem-cn", "setup")
  @js.native
  def setup(): BemCn = js.native
  @JSImport("bem-cn", "setup")
  @js.native
  def setup(settings: PartialBemSettings): BemCn = js.native
  
  @js.native
  trait BemBlock extends _BemMix {
    
    def apply(settings: BemSettings, context: BemContext, elemNameOrMods: (String | BemMods)*): BemItem | String = js.native
  }
  
  type BemCn = js.Function1[/* blockName */ String, Block_]
  
  @js.native
  trait BemContext extends StObject {
    
    var mixes: js.Array[BemMix] = js.native
    
    var mods: BemMods = js.native
    
    var name: String = js.native
    
    var states: BemStates = js.native
  }
  object BemContext {
    
    @scala.inline
    def apply(mixes: js.Array[BemMix], mods: BemMods, name: String, states: BemStates): BemContext = {
      val __obj = js.Dynamic.literal(mixes = mixes.asInstanceOf[js.Any], mods = mods.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
      __obj.asInstanceOf[BemContext]
    }
    
    @scala.inline
    implicit class BemContextMutableBuilder[Self <: BemContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMixes(value: js.Array[BemMix]): Self = StObject.set(x, "mixes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMixesVarargs(value: BemMix*): Self = StObject.set(x, "mixes", js.Array(value :_*))
      
      @scala.inline
      def setMods(value: BemMods): Self = StObject.set(x, "mods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStates(value: BemStates): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BemItem extends StObject {
    
    def has(state: BemState): BemItem with String = js.native
    
    def is(state: BemState): BemItem with String = js.native
    
    def mix(mix: BemMix*): BemItem with String = js.native
    
    def split(): BemItem with String = js.native
    def split(separator: js.UndefOr[scala.Nothing], limit: Double): BemItem with String = js.native
    def split(separator: String): BemItem with String = js.native
    def split(separator: String, limit: Double): BemItem with String = js.native
    
    def state(state: BemState): BemItem with String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - js.Array[java.lang.String]
    - typings.bemCn.mod.BemBlock
    - typings.bemCn.anon.ToString
    - js.UndefOr[scala.Nothing]
  */
  type BemMix = js.UndefOr[_BemMix | js.Array[String] | String]
  
  type BemMods = StringDictionary[String | Boolean | js.Any]
  
  @js.native
  trait BemSettings extends StObject {
    
    var classMap: js.UndefOr[Record[String, String]] = js.native
    
    var el: String = js.native
    
    var mod: String = js.native
    
    var modValue: String = js.native
    
    var ns: js.UndefOr[String] = js.native
  }
  object BemSettings {
    
    @scala.inline
    def apply(el: String, mod: String, modValue: String): BemSettings = {
      val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], mod = mod.asInstanceOf[js.Any], modValue = modValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[BemSettings]
    }
    
    @scala.inline
    implicit class BemSettingsMutableBuilder[Self <: BemSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassMap(value: Record[String, String]): Self = StObject.set(x, "classMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassMapUndefined: Self = StObject.set(x, "classMap", js.undefined)
      
      @scala.inline
      def setEl(value: String): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMod(value: String): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModValue(value: String): Self = StObject.set(x, "modValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNs(value: String): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNsUndefined: Self = StObject.set(x, "ns", js.undefined)
    }
  }
  
  type BemState = Record[String, Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.bemCn.bemCnStrings.`is-`
    - typings.bemCn.bemCnStrings.`has-`
  */
  trait BemStatePrefix extends StObject
  object BemStatePrefix {
    
    @scala.inline
    def `has-`: typings.bemCn.bemCnStrings.`has-` = "has-".asInstanceOf[typings.bemCn.bemCnStrings.`has-`]
    
    @scala.inline
    def `is-`: typings.bemCn.bemCnStrings.`is-` = "is-".asInstanceOf[typings.bemCn.bemCnStrings.`is-`]
  }
  
  /* Inlined std.Record<bem-cn.bem-cn.BemStatePrefix, bem-cn.bem-cn.BemState> */
  @js.native
  trait BemStates extends StObject {
    
    var `has-`: BemState = js.native
    
    var `is-`: BemState = js.native
  }
  object BemStates {
    
    @scala.inline
    def apply(`has-`: BemState, `is-`: BemState): BemStates = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("has-")(`has-`.asInstanceOf[js.Any])
      __obj.updateDynamic("is-")(`is-`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BemStates]
    }
    
    @scala.inline
    implicit class BemStatesMutableBuilder[Self <: BemStates] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setHas-`(value: BemState): Self = StObject.set(x, "has-", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setIs-`(value: BemState): Self = StObject.set(x, "is-", value.asInstanceOf[js.Any])
    }
  }
  
  type Block_ = IBlock with String
  
  @js.native
  trait IBlock extends BemItem {
    
    def apply(elemNameOrMods: (String | BemMods)*): BemItem with String = js.native
  }
  
  trait _BemMix extends StObject
  
  type _To = BemCn
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: BemCn = default
}
