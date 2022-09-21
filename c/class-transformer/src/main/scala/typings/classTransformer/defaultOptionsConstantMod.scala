package typings.classTransformer

import typings.classTransformer.classTransformerStrings.excludeAll
import typings.classTransformer.classTransformerStrings.exposeAll
import typings.classTransformer.targetMapInterfaceMod.TargetMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultOptionsConstantMod {
  
  /* Inlined std.Partial<class-transformer.class-transformer/types/interfaces/class-transformer-options.interface.ClassTransformOptions> */
  object defaultOptions {
    
    @JSImport("class-transformer/types/constants/default-options.constant", "defaultOptions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("class-transformer/types/constants/default-options.constant", "defaultOptions.enableCircularCheck")
    @js.native
    def enableCircularCheck: js.UndefOr[Boolean] = js.native
    inline def enableCircularCheck_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableCircularCheck")(x.asInstanceOf[js.Any])
    
    @JSImport("class-transformer/types/constants/default-options.constant", "defaultOptions.enableImplicitConversion")
    @js.native
    def enableImplicitConversion: js.UndefOr[Boolean] = js.native
    inline def enableImplicitConversion_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableImplicitConversion")(x.asInstanceOf[js.Any])
    
    @JSImport("class-transformer/types/constants/default-options.constant", "defaultOptions.excludeExtraneousValues")
    @js.native
    def excludeExtraneousValues: js.UndefOr[Boolean] = js.native
    inline def excludeExtraneousValues_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("excludeExtraneousValues")(x.asInstanceOf[js.Any])
    
    @JSImport("class-transformer/types/constants/default-options.constant", "defaultOptions.excludePrefixes")
    @js.native
    def excludePrefixes: js.UndefOr[js.Array[String]] = js.native
    inline def excludePrefixes_=(x: js.UndefOr[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("excludePrefixes")(x.asInstanceOf[js.Any])
    
    @JSImport("class-transformer/types/constants/default-options.constant", "defaultOptions.exposeDefaultValues")
    @js.native
    def exposeDefaultValues: js.UndefOr[Boolean] = js.native
    inline def exposeDefaultValues_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exposeDefaultValues")(x.asInstanceOf[js.Any])
    
    @JSImport("class-transformer/types/constants/default-options.constant", "defaultOptions.exposeUnsetFields")
    @js.native
    def exposeUnsetFields: js.UndefOr[Boolean] = js.native
    inline def exposeUnsetFields_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exposeUnsetFields")(x.asInstanceOf[js.Any])
    
    @JSImport("class-transformer/types/constants/default-options.constant", "defaultOptions.groups")
    @js.native
    def groups: js.UndefOr[js.Array[String]] = js.native
    inline def groups_=(x: js.UndefOr[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("groups")(x.asInstanceOf[js.Any])
    
    @JSImport("class-transformer/types/constants/default-options.constant", "defaultOptions.ignoreDecorators")
    @js.native
    def ignoreDecorators: js.UndefOr[Boolean] = js.native
    inline def ignoreDecorators_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreDecorators")(x.asInstanceOf[js.Any])
    
    @JSImport("class-transformer/types/constants/default-options.constant", "defaultOptions.strategy")
    @js.native
    def strategy: js.UndefOr[excludeAll | exposeAll] = js.native
    inline def strategy_=(x: js.UndefOr[excludeAll | exposeAll]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strategy")(x.asInstanceOf[js.Any])
    
    @JSImport("class-transformer/types/constants/default-options.constant", "defaultOptions.targetMaps")
    @js.native
    def targetMaps: js.UndefOr[js.Array[TargetMap]] = js.native
    inline def targetMaps_=(x: js.UndefOr[js.Array[TargetMap]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("targetMaps")(x.asInstanceOf[js.Any])
    
    @JSImport("class-transformer/types/constants/default-options.constant", "defaultOptions.version")
    @js.native
    def version: js.UndefOr[Double] = js.native
    inline def version_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
}
