package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGameSessionInput extends js.Object {
  /**
    * A unique identifier for the game session to update. 
    */
  var GameSessionId: ArnStringModel = js.native
  /**
    * The maximum number of players that can be connected simultaneously to the game session.
    */
  var MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.native
  /**
    * A descriptive label that is associated with a game session. Session names do not need to be unique.
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * Policy determining whether or not the game session accepts new players.
    */
  var PlayerSessionCreationPolicy: js.UndefOr[typings.awsSdk.gameliftMod.PlayerSessionCreationPolicy] = js.native
  /**
    * Game session protection policy to apply to this game session only.    NoProtection -- The game session can be terminated during a scale-down event.    FullProtection -- If the game session is in an ACTIVE status, it cannot be terminated during a scale-down event.  
    */
  var ProtectionPolicy: js.UndefOr[typings.awsSdk.gameliftMod.ProtectionPolicy] = js.native
}

object UpdateGameSessionInput {
  @scala.inline
  def apply(
    GameSessionId: ArnStringModel,
    MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined,
    Name: NonZeroAndMaxString = null,
    PlayerSessionCreationPolicy: PlayerSessionCreationPolicy = null,
    ProtectionPolicy: ProtectionPolicy = null
  ): UpdateGameSessionInput = {
    val __obj = js.Dynamic.literal(GameSessionId = GameSessionId.asInstanceOf[js.Any])
    if (!js.isUndefined(MaximumPlayerSessionCount)) __obj.updateDynamic("MaximumPlayerSessionCount")(MaximumPlayerSessionCount.get.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (PlayerSessionCreationPolicy != null) __obj.updateDynamic("PlayerSessionCreationPolicy")(PlayerSessionCreationPolicy.asInstanceOf[js.Any])
    if (ProtectionPolicy != null) __obj.updateDynamic("ProtectionPolicy")(ProtectionPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGameSessionInput]
  }
}

