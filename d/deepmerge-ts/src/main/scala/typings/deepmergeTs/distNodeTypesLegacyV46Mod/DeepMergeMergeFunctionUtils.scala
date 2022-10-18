package typings.deepmergeTs.distNodeTypesLegacyV46Mod

import typings.deepmergeTs.anon.ReadonlydefaultMergesymbo
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The utils provided to the merge functions.
  */
/* Inlined std.Readonly<{  mergeFunctions :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctions<M, MM>,   defaultMergeFunctions :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionsDefaults,   metaDataUpdater :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.MetaDataUpdater<M, MM>, deepmerge <Ts extends std.ReadonlyArray<unknown>>(values : Ts): unknown,   useImplicitDefaultMerging :boolean,   actions :std.Readonly<{  defaultMerge :symbol,   skip :symbol}>}> */
@js.native
trait DeepMergeMergeFunctionUtils[M, MM /* <: DeepMergeBuiltInMetaData */] extends StObject {
  
  val actions: ReadonlydefaultMergesymbo = js.native
  
  def deepmerge[Ts /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param values because its type Ts is not an array type */ values: Ts
  ): Any = js.native
  
  val defaultMergeFunctions: DeepMergeMergeFunctionsDefaults = js.native
  
  val mergeFunctions: DeepMergeMergeFunctions[M, MM] = js.native
  
  def metaDataUpdater(previousMeta: M, metaMeta: Partial[MM]): M = js.native
  def metaDataUpdater(previousMeta: Unit, metaMeta: Partial[MM]): M = js.native
  
  val useImplicitDefaultMerging: Boolean = js.native
}
