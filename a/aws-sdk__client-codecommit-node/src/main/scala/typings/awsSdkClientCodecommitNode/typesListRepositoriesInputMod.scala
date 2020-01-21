package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ascending
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.descending
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.lastModifiedDate
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.repositoryName
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/ListRepositoriesInput", JSImport.Namespace)
@js.native
object typesListRepositoriesInputMod extends js.Object {
  @js.native
  trait ListRepositoriesInput extends InputTypesUnion {
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.native
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[NodeHttpOptions] = js.native
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.native
    /**
      * <p>An enumeration token that allows the operation to batch the results of the operation. Batch sizes are 1,000 for list repository operations. When the client sends the token back to AWS CodeCommit, another page of 1,000 records is retrieved.</p>
      */
    var nextToken: js.UndefOr[String] = js.native
    /**
      * <p>The order in which to sort the results of a list repositories operation.</p>
      */
    var order: js.UndefOr[ascending | descending | String] = js.native
    /**
      * <p>The criteria used to sort the results of a list repositories operation.</p>
      */
    var sortBy: js.UndefOr[repositoryName | lastModifiedDate | String] = js.native
  }
  
}

