package typings.ckeditorCkeditor5Utils

import typings.std.Exclude
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcConfigMod {
  
  @JSImport("@ckeditor/ckeditor5-utils/src/config", JSImport.Default)
  @js.native
  /**
    * Creates an instance of the {@link ~Config} class.
    *
    * @param configurations The initial configurations to be set. Usually, provided by the user.
    * @param defaultConfigurations The default configurations. Usually, provided by the system.
    */
  open class default[Cfg] ()
    extends StObject
       with Config[Cfg] {
    def this(configurations: Partial[Cfg]) = this()
    def this(configurations: Unit, defaultConfigurations: Partial[Cfg]) = this()
    def this(configurations: Partial[Cfg], defaultConfigurations: Partial[Cfg]) = this()
  }
  
  @js.native
  trait Config[Cfg] extends StObject {
    
    /**
      * Store for the whole configuration.
      */
    /* private */ val _config: Any = js.native
    
    /**
      * Get specified configuration from specified source (nested object).
      *
      * @param source level of nested object.
      * @param name The configuration name. Configuration names are case-sensitive.
      * @returns The configuration value or `undefined` if the configuration entry was not found.
      */
    /* private */ var _getFromSource: Any = js.native
    
    /**
      * Iterates through passed object and calls {@link #_setToTarget} method with object key and value for each property.
      *
      * @param target Nested config object.
      * @param configuration Configuration data set
      * @param isDefine Defines if passed configuration is default configuration or not.
      */
    /* private */ var _setObjectToTarget: Any = js.native
    
    /**
      * Saves passed configuration to the specified target (nested object).
      *
      * @param target Nested config object.
      * @param name The configuration name or an object from which take properties as
      * configuration entries. Configuration names are case-sensitive.
      * @param value The configuration value. Used if a name is passed.
      * @param isDefine Define if passed configuration should overwrite existing one.
      */
    /* private */ var _setToTarget: Any = js.native
    
    /**
      * Does exactly the same as {@link #set:CONFIG_OBJECT} with one exception – passed configuration extends
      * existing one, but does not overwrite already defined values.
      *
      * This method is supposed to be called by plugin developers to setup plugin's configurations. It would be
      * rarely used for other needs.
      *
      * @label CONFIG_OBJECT
      * @param config The configuration object from which take properties as
      * configuration entries. Configuration names are case-sensitive.
      */
    def define(config: Partial[Cfg]): Unit = js.native
    /**
      * Does exactly the same as {@link #set:KEY_VALUE} with one exception – passed configuration extends
      * existing one, but does not overwrite already defined values.
      *
      * This method is supposed to be called by plugin developers to setup plugin's configurations. It would be
      * rarely used for other needs.
      *
      * @label KEY_VALUE
      * @param name The configuration name. Configuration names are case-sensitive.
      * @param value The configuration value.
      */
    def define[K /* <: String */](name: K, value: GetSubConfig[Cfg, K]): Unit = js.native
    
    /**
      * Gets the value for a configuration entry.
      *
      * ```ts
      * config.get( 'name' );
      * ```
      *
      * Deep configurations can be retrieved by separating each part with a dot.
      *
      * ```ts
      * config.get( 'toolbar.collapsed' );
      * ```
      *
      * @param name The configuration name. Configuration names are case-sensitive.
      * @returns The configuration value or `undefined` if the configuration entry was not found.
      */
    def get[K /* <: String */](name: K): js.UndefOr[GetSubConfig[Cfg, K]] = js.native
    
    /**
      * Iterates over all top level configuration names.
      */
    def names(): js.Iterable[String] = js.native
    
    /**
      * Set configuration values.
      *
      * It accepts an object, which properties and values will be used to set configurations.
      *
      * ```ts
      * config.set( {
      * 	width: 500
      * 	toolbar: {
      * 		collapsed: true
      * 	}
      * } );
      *
      * // Equivalent to:
      * config.set( 'width', 500 );
      * config.set( 'toolbar.collapsed', true );
      * ```
      *
      * Passing an object as the value will amend the configuration, not replace it.
      *
      * ```ts
      * config.set( 'toolbar', {
      * 	collapsed: true,
      * } );
      *
      * config.set( 'toolbar', {
      * 	color: 'red',
      * } );
      *
      * config.get( 'toolbar.collapsed' ); // true
      * config.get( 'toolbar.color' ); // 'red'
      * ```
      *
      * It accepts both a name/value pair or an object, which properties and values will be used to set
      * configurations. See {@link #set:KEY_VALUE}.
      *
      * @label CONFIG_OBJECT
      * @param config The configuration object from which take properties as
      * configuration entries. Configuration names are case-sensitive.
      */
    def set(config: Partial[Cfg]): Unit = js.native
    /**
      * Set configuration values.
      *
      * It also accepts setting a "deep configuration" by using dots in the name. For example, `'resize.width'` sets
      * the value for the `width` configuration in the `resize` subset.
      *
      * ```ts
      * config.set( 'resize.width', 500 );
      * ```
      *
      * It accepts both a name/value pair or an object, which properties and values will be used to set
      * configurations. See {@link #set:CONFIG_OBJECT}.
      *
      * @label KEY_VALUE
      * @param name The configuration name. Configuration names are case-sensitive.
      * @param value The configuration value.
      */
    def set[K /* <: String */](name: K, value: GetSubConfig[Cfg, K]): Unit = js.native
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    K extends keyof T ? T[K] : K extends / * template literal string: ${inferK1}.${inferK2} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify K1 * / any extends keyof T ? @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/config.GetSubConfig<@ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/config.OnlyObject<T[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify K1 * / any]>, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify K2 * / any> : unknown : unknown
    }}}
    */
  @js.native
  trait GetSubConfig[T, K] extends StObject
  
  type OnlyObject[T] = Exclude[T, js.UndefOr[Null | String | Double | Boolean | js.Array[Any]]]
}
